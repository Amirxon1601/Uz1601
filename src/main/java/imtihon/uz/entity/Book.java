package imtihon.uz.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(generator = "book_seq")
    @SequenceGenerator(name = "book_seq",sequenceName = "book_id_seq",allocationSize = 1)
    private Integer id;
    private String name;
    private String author;
}