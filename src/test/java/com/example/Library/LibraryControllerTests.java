package com.example.Library;

import com.example.Library.service.BookService;
import org.junit.jupiter.api.Test;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@AutoConfigureRestDocs(outputDir = "target/generated-snippets")
@WebMvcTest(LibraryController.class)
class LibraryControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    void contextLoads() throws Exception {
        //sanity test
    }

    @Test
    void testGetAllBooks() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/books")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(document("getAllBooks"));
    }

    @Test
    void testGetBookById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/books/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(document("getBookById"));
    }

    @Test
    void testAddBook() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":\"Test Book\",\"author\":\"Test Author\",\"description\":\"Test Description\"}"))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andDo(document("addBook"));
    }

    @Test
    void testUpdateBook() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":\"Updated Book\",\"author\":\"Updated Author\",\"description\":\"Updated Description\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(document("updateBook"));
    }

    @Test
    void testDeleteBook() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/{id}", 1))
                .andExpect(MockMvcResultMatchers.status().isNoContent())
                .andDo(document("deleteBook"));
    }
}
