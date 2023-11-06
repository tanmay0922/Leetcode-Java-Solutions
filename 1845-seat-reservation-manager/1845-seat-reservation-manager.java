class SeatManager {
    // Min heap to store all unreserved seats.
    private PriorityQueue<Integer> availableSeats;

    public SeatManager(int n) {
        // Initially all seats are unreserved.
        availableSeats = new PriorityQueue<>();
        for (int seatNumber = 1; seatNumber <= n; ++seatNumber) {
            availableSeats.offer(seatNumber);
        }
    }

    public int reserve() {
        // Get the smallest-numbered unreserved seat from the min heap.
        int seatNumber = availableSeats.poll();
        return seatNumber;
    }

    public void unreserve(int seatNumber) {
        // Push the unreserved seat back into the min heap.
        availableSeats.offer(seatNumber);
    }
}
/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */