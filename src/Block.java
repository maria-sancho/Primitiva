import java.util.HashSet;
import java.util.Set;
import java.util.Random;


public class Block {

    private Set<Integer> numbers;

    public Block(int quantity) {
        this.numbers = new HashSet<>();

        quantity = Math.max(6, quantity);
        quantity = Math.min(49, quantity);

        Random rand = new Random();
        while (this.numbers.size() < quantity) {
            int num = rand.nextInt(49) + 1;
            this.numbers.add(num);
        }
    }

    public Block(int[] nums) {
        this.numbers = new HashSet<>();
        for (int num : nums) {
            this.numbers.add(num);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int num : this.numbers) {
            sb.append(num + ",");
        }

        // remove the last comma
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
    public int[] getNumbers() {
        int[] nums = new int[this.numbers.size()];
        int i = 0;
        for (int num : this.numbers) {
            nums[i] = num;
            i++;
        }
        return nums;
    }
}

