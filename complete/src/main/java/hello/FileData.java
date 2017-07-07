package hello;

import java.util.List;

public class FileData {

    private String patient_ID;
    private String PSA;
    private String prostate_vol;
    private String lesion_size;
    private String sector;
    private String PIRADS_score;
    private String GLEASON_score;

    public FileData() {
    }

    public String getPatient_ID() {
        return patient_ID;
    }

    public void setPatient_ID(String patient_ID) {
        this.patient_ID = patient_ID;
    }

    public String getPSA() {
        return PSA;
    }

    public void setPSA(String PSA) {
        this.PSA = PSA;
    }

    public String getProstate_vol() {
        return prostate_vol;
    }

    public void setProstate_vol(String prostate_vol) {
        this.prostate_vol = prostate_vol;
    }

    public String getLesion_size() {
        return lesion_size;
    }

    public void setLesion_size(String lesion_size) {
        this.lesion_size = lesion_size;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPIRADS_score() {
        return PIRADS_score;
    }

    public void setPIRADS_score(String PIRADS_score) {
        this.PIRADS_score = PIRADS_score;
    }

    public String getGLEASON_score() {
        return GLEASON_score;
    }

    public void setGLEASON_score(String GLEASON_score) {
        this.GLEASON_score = GLEASON_score;
    }
}
