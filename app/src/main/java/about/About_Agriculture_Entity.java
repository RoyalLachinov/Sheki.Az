package about;

class About_Agriculture_Entity {
    private final String number;
    private final String village;
    private final String consumerCount;
    private final String landArea;
    private final String taxil;
    private final String qargidali;
    private final String pambiq;
    private final String kartof;
    private final String terevez;
    private final String uzumbagi;
    private final String diger;
    private final String yardim;

    public About_Agriculture_Entity(String number, String village, String consumerCount, String landArea, String taxil,
                                    String qargidali, String kartof, String terevez, String uzumbagi,
                                    String diger, String yardim) {
        this.number = number;
        this.village = village;
        this.consumerCount = consumerCount;
        this.landArea = landArea;
        this.taxil = taxil;
        this.qargidali = qargidali;
        this.pambiq = "--";
        this.kartof = kartof;
        this.terevez = terevez;
        this.uzumbagi = uzumbagi;
        this.diger = diger;
        this.yardim = yardim;
    }

    public String getNumber() {
        return number;
    }


    public String getVillage() {
        return village;
    }

    public String getConsumerCount() {
        return consumerCount;
    }

    public String getLandArea() {
        return landArea;
    }


    public String getTaxil() {
        return taxil;
    }


    public String getQargidali() {
        return qargidali;
    }


    public String getPambiq() {
        return pambiq;
    }


    public String getKartof() {
        return kartof;
    }


    public String getTerevez() {
        return terevez;
    }

    public String getUzumbagi() {
        return uzumbagi;
    }

    public String getDiger() {
        return diger;
    }

    public String getYardim() {
        return yardim;
    }

}
