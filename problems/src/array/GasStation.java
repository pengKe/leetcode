package array;

public class GasStation {
    // time : O(n)
    // space : O(1)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length == 0 || cost.length == 0 || gas.length != cost.length)
            return -1;
        int total = 0, index = 0, sum = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (sum < 0) {
                index = i;
                sum = gas[i] - cost[i];
            } else {
                sum += gas[i] - cost[i];
            }
        }
        return total < 0 ? -1 : index;
    }

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        System.out.println(gasStation.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));

    }
}
