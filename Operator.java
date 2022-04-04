public class Operator {
    String operatorString;
    String operatorSimbol;

    public Operator(String operatorString){
        this.operatorString=operatorString.toLowerCase();
        getOperatorSimbol();
    }

    public String getOperatorSimbol() {
        switch(operatorString){
            case "kali":
                operatorSimbol="*";
                break;
            case "bagi":
                operatorSimbol="/";
                break;
            case "tambah":
                operatorSimbol="+";
                break;
            case "kurang":
                operatorSimbol="-";
                break;
            case "pangkat":
                operatorSimbol="^";
                break;
            default:
                System.out.println("input salah");
                operatorSimbol=null;

        }
        return operatorSimbol;
    }

}
