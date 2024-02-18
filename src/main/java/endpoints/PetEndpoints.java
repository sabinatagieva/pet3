package endpoints;

public enum PetEndpoints {
    ADD_PET("/pet"),
    GET_PET("/pet/{petId}");

    private final String endpoints;

    PetEndpoints(String endpoints) {
        this.endpoints = endpoints;
    }

    public String getEndpoints() {
        return endpoints;
    }
}
