package step;

import config.Requests;
import dto.response.get.GetPetDto;
import endpoints.PetEndpoints;

import static config.RequestService.request;
import static config.ResponseService.ok;

public class PetSteps {

    Requests requests = new Requests();

    public GetPetDto getPet() {
        return requests.get(request(),
                PetEndpoints.GET_PET.getEndpoints()).then().spec(ok())
                .extract().body().as(GetPetDto.class);
    }
}
