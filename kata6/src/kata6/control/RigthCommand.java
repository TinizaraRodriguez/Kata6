
package kata6.control;

import kata6.model.Block;

public class RigthCommand implements Command{
    
    private final Block block;

    public RigthCommand(Block block) {
        this.block = block;
    }

    @Override
    public void execute() {
        block.rigth();
    }
    
    

}
