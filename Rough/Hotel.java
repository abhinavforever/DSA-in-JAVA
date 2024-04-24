package Rough;

 class Hotel {
    private int n; // Number of rooms
    private int[][] doors; // Connections between rooms
    private int[] roomTypes; // Types of rooms (0: empty, 1: sleeping kid, 2: mosquito)
    private boolean[] visited; // To keep track of visited rooms
    private int minDoorsToClose; // Minimum number of doors to close

    public Hotel(int n, int[][] doors, int[] roomTypes) {
        this.n = n;
        this.doors = doors;
        this.roomTypes = roomTypes;
        this.visited = new boolean[n];
        this.minDoorsToClose = 0;
    }

    // DFS to traverse the rooms and close doors to separate kids from mosquitoes
    private void dfs(int room) {
        visited[room] = true;
        for (int i = 0; i < n; i++) {
            if (doors[room][i] == 1 && !visited[i]) {
                if (roomTypes[i] == 2) {
                    minDoorsToClose++; // Close the door if there's a mosquito in the adjacent room
                } else {
                    dfs(i); // Continue DFS if there's no mosquito
                }
            }
        }
    }

    // Method to find the minimum number of doors to close
    public int findMinDoorsToClose() {
        for (int i = 0; i < n; i++) {
            if (!visited[i] && roomTypes[i] == 1) {
                dfs(i); // Start DFS from each sleeping kid room
            }
        }
        return minDoorsToClose;
    }
    public static void main(String[] args) {
        // Example usage:
        int n = 5; // Number of rooms
        int[][] doors = {
                {0, 1, 1, 0, 0}, // Connections between rooms (adjacency matrix)
                {1, 0, 1, 1, 0},
                {1, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {0, 0, 1, 1, 0}
        };
        int[] roomTypes = {0, 1, 0, 2, 1}; // Types of rooms

        Hotel hotel = new Hotel(n, doors, roomTypes);
        int minDoorsToClose = hotel.findMinDoorsToClose();
        System.out.println("Minimum number of doors to close: " + minDoorsToClose);
    }
}





