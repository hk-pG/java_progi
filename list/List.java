public class List<T> {
    private T data;
    private List<T> next;

    public List(T data) {
        this.data = data;
        this.next = null;
    }

    public List<T> createCell(T data) {
        return new List<>(data);
    }

    public boolean isEmptyCell(List<T> cell) {
        try {
            return cell == null;
        } catch (NullPointerException e) {
            return true;
        }
    }

    public List<T> getNextCell() {
        return this.next;
    }

    public T getCellData() {
        return this.data;
    }

    public void setCellData(T data) {
        this.data = data;
    }

    public void setNextCell(T data) {
        this.next = createCell(data);
    }

    public void setNextCell(List<T> next) {
        this.next = next;
    }

    public void insertCellHead(T data) {
        T oldHeadData = this.getCellData();
        List<T> newCell = createCell(oldHeadData);
        newCell.setNextCell(this.getNextCell());

        this.setNextCell(newCell);

        this.setCellData(data);
    }

    public void insertCellTail(T data) {
        if (isEmptyCell(this)) {
            this.setCellData(data);
            this.setNextCell((T) null);
        } else {
            List<T> next = this.getNextCell();
            try {
                next.insertCellTail(data);
            } catch (NullPointerException e) {
                this.setNextCell(data);
            }
        }
    }

    public T removeCell() {
        T data = this.getCellData();
        this.setCellData(this.getNextCell().getCellData());
        this.setNextCell(this.getNextCell().getNextCell());
        return data;
    }

    public T removeCell(int index) {
        if (index <= 0) {
            return this.removeCell();
        } else {
            List<T> next = this.getNextCell();
            return next.removeCell(index - 1);
        }
    }

    public void printAllCells() {
        try {
            System.out.print(this.getCellData());
            if (!isEmptyCell(this.getNextCell())) {
                System.out.print(" -> ");
            }
            this.getNextCell().printAllCells();
        } catch (NullPointerException e) {
            System.out.println("");
        }
    }
}