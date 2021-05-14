public class Procedure {
    private String ProcedureName;
    private String ProcedureDate;
    private String PractitionerName;
    private double charges;

    public Procedure(String ProcedureName, String ProcedureDate, String PractitionerName, double charges){
        this.ProcedureName=ProcedureName;
        this.ProcedureDate=ProcedureDate;
        this.PractitionerName=PractitionerName;
        this.charges=charges;
    }
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }
    public String getProcedureName() {
        return this.ProcedureName;
    }
    public void setProcedureDate(String ProcedureDate) {
        this.ProcedureDate = ProcedureDate;
    }
    public String getProcedureDate() {
        return this.ProcedureDate;
    }

    public String getPractitionerName() {
        return this.PractitionerName;
    }

    public void setPractitionerName(String PractitionerName) {
        this.PractitionerName = PractitionerName;
    }
    public void setCharges(double charges) {
        this.charges = charges;
    }
    public double getCharges() {
        return this.charges;
    }
}
