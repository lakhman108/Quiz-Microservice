package com.lucky.quizmicroservice.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity

public class Quiz {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;

String title;

@ElementCollection
List<Integer> questionIds;
}
