public class BilanganString {
    String bilanganstring;
    int bilangan;

    public BilanganString(String bilanganstring){
        this.bilanganstring=bilanganstring.toLowerCase();
        getBilangan();

    }

    public int getBilangan() {
        String[] bil=bilanganstring.split(" ");
        String bil1 = null;
        switch(bil[0]){
            case "sebelas":
                bil1="11";
                break;
            case "satu":
                bil1="1";
                break;
            case "dua":
                bil1="2";
                break;
            case "tiga":
                bil1="3";
                break;
            case "empat":
                bil1="4";
                break;
            case "lima":
                bil1="5";
                break;
            case "enam":
                bil1="6";
                break;
            case "tujuh":
                bil1="7";
                break;
            case "delapan":
                bil1="8";
                break;
            case "sembilan":
                bil1="9";
                break;
            case "sepuluh":
                bil1="10";
                break;
            default:
                System.out.println("input salah");
        }
        String bil2;
        String bil3 = null;
        if(bil.length >1){
            switch(bil[1]){
                case "belas":
                    bil2="1";
                    bil3=bil2+bil1;
                    break;
                case "puluh":
                    bil2="0";
                    bil3=bil1+bil2;
                    break;
                case "":
                    bil3=bil1;
                    break;
                default:
                    System.out.println("input salah");}
        }else{
            bil3=bil1;
        }
        bilangan=Integer.parseInt(bil3);
        if (bilangan>20){
            System.out.println("jumlah bilangan melebihi batas");
            return -1;
        }else{

            return bilangan;
        }
    }
    public boolean apakahDuaDigit(){
        return bilangan>9;
    }
    public boolean apakahLebihDari10(){
        return bilangan >10;
    }
}
