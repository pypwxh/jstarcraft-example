package com.jstarcraft.example.movie.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jstarcraft.example.movie.service.MovieItem;

import it.unimi.dsi.fastutil.objects.Object2FloatMap;

/**
 * 物品输出
 * 
 * @author Birdy
 *
 */
public class MovieItemOutput {

    /** 物品标识 */
    private int id;

    /** 物品标题 */
    private String title;

    /** 物品日期 */
    private LocalDate date;

    /** 得分 */
    private float score;

    public MovieItemOutput(MovieItem item, float score) {
        this.id = item.getIndex();
        this.title = item.getTitle();
        this.date = item.getDate();
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public float getScore() {
        return score;
    }

    public static List<MovieItemOutput> instancesOf(Object2FloatMap<MovieItem> items) {
        List<MovieItemOutput> instances = new ArrayList<>(items.size());
        for (Object2FloatMap.Entry<MovieItem> term : items.object2FloatEntrySet()) {
            MovieItemOutput instance = new MovieItemOutput(term.getKey(), term.getFloatValue());
            instances.add(instance);
        }
        return instances;
    }

}
