package interpreter;

public class Contex {

    private byte[] memory;
    private int position = 0;
    private int memorySize = 255;


    public Contex(int memorySize) {
        this.memorySize = memorySize;
        memory = new byte[memorySize];
    }

    public Contex() {
        memory = new byte[memorySize];
    }

    public byte[] getMemory() {
        return memory;
    }

    public void setMemory(byte[] memory) {
        this.memory = memory;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void incCurrent(){
        memory[position]++;
    }

    public void decCurrent(){
        memory[position]--;
    }

    public  void rightPosition(){
        position++;
        if (position > memorySize-1)
            position = 0;
    }

    public void leftPosition(){

        position--;
        if (position < 0)
            position = memorySize-1;
    }

    public byte getCurrent(){
        return memory[position];
    }
}
