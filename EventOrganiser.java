import java.util.ArrayList;

public class EventOrganiser {


    private int CUSTID;

    private String CUSTNAME;

    private String CUSTADDR;

    public int getCUSTID() {

                return CUSTID;
            }


    public void setCUSTID(int CUSTID) {
        this.CUSTID = CUSTID;
    }

    public String getCUSTNAME() {
        return CUSTNAME;
    }

    public void setCUSTNAME(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public String getCUSTADDR() {
        return CUSTADDR;
    }

    public void setCUSTADDR(String CUSTADDR) {
        this.CUSTADDR = CUSTADDR;
    }

    public String getCUSTEMAIL() {
        return CUSTEMAIL;
    }

    public void setCUSTEMAIL(String CUSTEMAIL) {
        this.CUSTEMAIL = CUSTEMAIL;
    }

    public int getCUSTPHONE() {
        return CUSTPHONE;
    }

    public void setCUSTPHONE(int CUSTPHONE) {
        this.CUSTPHONE = CUSTPHONE;
    }

    private String CUSTEMAIL;

    private int CUSTPHONE;


    public void PrintGuests() {
        ArrayList<String> Data = new ArrayList<>();
            Data.add(String.valueOf(getCUSTID()));
            System.out.println("ID ANDA : " + getCUSTID());

            Data.add(getCUSTNAME());
            System.out.println("Nama Anda : " + this.getCUSTNAME());
            Data.add(getCUSTADDR());
            System.out.println("ADDR Anda : " +this.getCUSTADDR());
            Data.add(getCUSTEMAIL());
            System.out.println("Emali Anda : " +this.getCUSTEMAIL());
            Data.add(String.valueOf(getCUSTPHONE()));
            System.out.println("Phone Anda : " + this.getCUSTPHONE());
        }


    public EventOrganiser(){

    }

    public EventOrganiser(String id, String Name, String Addr, String Email) {

    }
}
