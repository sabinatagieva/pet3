package builders;

import dto.request.PetDto;

public class PetBuilders {

    private String name;

    public PetBuilders name(String name) {
        this.name = name;
        return this;
    }

    public PetDto build() {
        return new PetDto(name);
    }
}
