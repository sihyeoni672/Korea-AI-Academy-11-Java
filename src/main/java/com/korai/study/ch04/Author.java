package com.korai.study.ch04;

import lombok.*;

@Data // get, set, eq, hc, toStr
@AllArgsConstructor
public class Author {
    private String name;
    private String birthday;

    // @NoArgsConstructor
    public Author() {

    }

    public Author(String name) {
        this.name = name;
    }

    /*public Author(String birthday){
        this.birthday=birthday;
    }*/

    @Data
    @RequiredArgsConstructor
    class Publisher {
        private final String name;
        private String address;
    }

}

class AuthorMain {
    public static void main(String[] args) {
        Author a = new Author();
        Author.Publisher p = a.new Publisher("한빛미디어");
    }
}
