package com.kbstar.controller;

import com.kbstar.dto.ItemDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/tables")
public class ItemController {

    @RequestMapping("")
    public String main(Model model) {
        List<ItemDTO> list = new ArrayList<>();
        list.add((new ItemDTO(1, "a", 1000, "a.jpg", new Date())));
        list.add((new ItemDTO(2, "b", 1000, "b.jpg", new Date())));
        list.add((new ItemDTO(3, "c", 1000, "c.jpg", new Date())));
        list.add((new ItemDTO(4, "d", 1000, "d.jpg", new Date())));
        list.add((new ItemDTO(5, "e", 1000, "e.jpg", new Date())));
        list.add((new ItemDTO(6, "f", 1000, "f.jpg", new Date())));
        list.add((new ItemDTO(7, "g", 1000, "g.jpg", new Date())));
        list.add((new ItemDTO(8, "h", 1000, "h.jpg", new Date())));
        list.add((new ItemDTO(9, "i", 1000, "i.jpg", new Date())));
        list.add((new ItemDTO(10, "j", 1000, "j.jpg", new Date())));


        model.addAttribute("allitem", list);

        model.addAttribute("center", "tables");
        return "index";
    }


}
