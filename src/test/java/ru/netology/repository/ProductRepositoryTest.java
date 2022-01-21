package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book list = new Book();
    Product first = new Book(1, "Анна Каренина", 1000, "Толстой");
    Product second = new Book(2, "Война и мир", 1100, "Толстой");

    @Test
    public void shouldSaveOneItem() {
        repository.save(list);

        Product[] expected = new Product[]{list};
        Product[] actual = repository.getAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldRemoveIfExists() {
        repository.save(first);

        int idToRemove=1;
        repository.removeById(idToRemove);

        Product[] expected = new Product[] {};
        Product[] actual = repository.getAll();

        assertArrayEquals(expected, actual);

    }


}