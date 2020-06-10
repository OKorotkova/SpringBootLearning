package de.springboot.service;

import de.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> items =  new ArrayList<>();
    static {
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com", "http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico", "Stack Overflow (StackExchanges)", "for professional programmers"));
        items.add(new StackoverflowWebsite("servletfault", "http://servletfault.com", "http://cdn.sstatic.net/Sites/servletfault/img/favicon.ico", "Servlet Fault (StackExchanges)", "for system and network administrators"));
    }

    public List<StackoverflowWebsite> findAll(){
        return items;
    }
}
