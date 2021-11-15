package homework5_robotswar;

public class RobotA extends Player{
    int cellsI,cellsJ;

    public RobotA(String name, String[][] field, String symbol) {
        super(name, field, symbol);
        this.cellsI = 0;
    }

    public int getCellsI() {
        return cellsI;
    }

    public void setCellsI(int cellsI) {
        this.cellsI = cellsI;
    }
}
