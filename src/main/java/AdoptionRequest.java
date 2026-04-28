public class AdoptionRequest {
    private String namePet;
    private int agePet;
    private Pet pet;
    private StatusRequest requestStatus;

    public AdoptionRequest(String namePet, int agePet) {
        this.namePet = namePet;
        this.agePet = agePet;

        this.requestStatus=StatusRequest.NEW;
    }

    public static void createRequest(String namePet, int agePet, Pet pet){
        AdoptionRequest request = new AdoptionRequest(namePet, agePet);

    }
}
