package com.thoughtworks.cleanarch.domain.contexts.edit;

import com.thoughtworks.cleanarch.domain.core.concepts.AggregateRoot;
import com.thoughtworks.cleanarch.domain.core.concepts.Enitity;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Blog implements AggregateRoot {
    private String id;
    private String title;
    private String content;
    private List<HistoryBolg> historyBolgs;
    public Blog(String title, String content){
        this.title = title;
        this.content = content;
        this.id = UUID.randomUUID().toString();
    }
    public void saveDraw(String title,String content){
        this.title = title;
        this.content = content;
    }
}
