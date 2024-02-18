package dto.request;

import builders.PetBuilders;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetDto {
    private String name;
    public PetDto(String name) {
        this.name = name;
    }
    public static PetBuilders builder() {
        return new PetBuilders();
    }

    public String getName() {
        return name;
    }
}
