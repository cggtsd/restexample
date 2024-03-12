package cgg.restclient.restexample.services;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import cgg.restclient.restexample.model.Todo;

@Service
public class TodoService {

    private RestClient restClient;

    public TodoService(RestClient restClient) {
        this.restClient = restClient;
    }

    // get single todo
    public Todo getTodo(int id) {
        // call to api to get todo
        return restClient.get().uri("/todos/{id}", id).retrieve().body(Todo.class);

    }

    // get all todos
    public List<Todo> getTodos() {
        return restClient.get().uri("/todos").retrieve()
                .body(new ParameterizedTypeReference<List<Todo>>() {

                });
    }

    // create todo
    public Todo createTodo(Todo todo) {
        return restClient.post().uri("/todos/").contentType(MediaType.APPLICATION_JSON).body(todo).retrieve()
                .body(Todo.class);
    }

}
