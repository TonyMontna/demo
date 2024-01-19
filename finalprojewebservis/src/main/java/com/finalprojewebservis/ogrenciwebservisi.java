package com.finalprojewebservis;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ogrenci")
public class ogrenciwebservisi {

    public record Ogrenci(String adSoyad, String numara) {};

    private static final List<String> OGRENCI_LISTESI = new ArrayList<>();

    static {
        OGRENCI_LISTESI.add(new Ogrenci("ali veli", "1").toString());
        OGRENCI_LISTESI.add(new Ogrenci("ali veli", "2").toString());
    }

    @GetMapping("/")
    public List<String> listele() {
        return OGRENCI_LISTESI;
    }
}
