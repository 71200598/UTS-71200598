public class Kalkulator {
    int bil2;
    int bil1;
    String op;




    Kalkulator(BilanganString b1, BilanganString b2, Operator op) {
        this.bil1=b1.getBilangan();
        this.bil2=b2.getBilangan();
        this.op=op.getOperatorSimbol();

    }

    public void hitung(){
        switch(op){
            case "*":
                System.out.println("Hasil: "+(bil1*bil2));
                break;
            case "/":
                System.out.println("Hasil: "+(bil1/bil2));
                break;
            case "+":
                System.out.println("Hasil: "+(bil1+bil2));
                break;
            case "-":
                System.out.println("Hasil: "+(bil1-bil2));
                break;
            case "^":
                System.out.println("Hasil: "+Math.pow(bil1,bil2));
                break;
            default:
                System.out.println("input salah");
        }
    }
}
