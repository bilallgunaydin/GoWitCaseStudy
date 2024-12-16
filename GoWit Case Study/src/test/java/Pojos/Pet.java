package Pojos;


import Enums.PetStatus;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pet {
    private long id;
    private String name;
    private List<String> photoUrls;
    private PetStatus status;
    private Category category;
    private List<Tag> tags;
}