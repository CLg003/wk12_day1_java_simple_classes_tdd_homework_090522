public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume) {
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public void setSheetsOfPaper(int newSheetsOfPaper) {
        this.sheetsOfPaper = newSheetsOfPaper;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int newTonerVolume) {
        this.tonerVolume = newTonerVolume;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        int resourcesRequired = numberOfPages * numberOfCopies;
        if (resourcesRequired < this.getSheetsOfPaper() && resourcesRequired < this.getTonerVolume()) {
            this.setSheetsOfPaper(this.getSheetsOfPaper() - resourcesRequired);
            this.setTonerVolume(this.getTonerVolume() - resourcesRequired);
        } else {
            System.out.println("Not enough paper or toner to print.");
        }
    }
}
