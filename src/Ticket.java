import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Ticket {

    private List<Block> blocks;

    public Ticket(int numBlocks) {
        this.blocks = new ArrayList<>();
        for (int i = 0; i < numBlocks; i++) {
            this.blocks.add(new Block(6));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Block block : this.blocks) {
            sb.append(block.toString() + "\n");
        }
        return sb.toString();
    }

    public void printUsedNumbers() {
        Set<Integer> usedNumbers = new HashSet<>();
        for (Block block : this.blocks) {
            for (int num : block.getNumbers()) {
                usedNumbers.add(num);
            }
        }

        for (int num : usedNumbers) {
            System.out.print(num + ",");
        }
        System.out.println();
    }
}