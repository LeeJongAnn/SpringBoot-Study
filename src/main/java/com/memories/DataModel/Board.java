package com.memories.DataModel;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int count;

    @Column(nullable = false,length=64)
    private String title;

    @JoinColumn(name = "UserId")
    @ManyToOne(fetch = FetchType.EAGER )
    private User user;

    @OneToMany(mappedBy = "board",fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"board"})
    private List<Reply> replys;

    @Lob
    private String content;

    @CreationTimestamp
    private Timestamp timestamp;

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", count=" + count +
                ", title='" + title + '\'' +
                ", user=" + user +
                ", replys=" + replys +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
