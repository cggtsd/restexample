package cgg.restclient.restexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    private int id;
    private boolean completed;
    private String title;
    private int userId;

}
