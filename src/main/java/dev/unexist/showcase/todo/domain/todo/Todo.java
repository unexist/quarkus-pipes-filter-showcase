/**
 * @package Quarkus-Pipes-Filters-Showcase
 *
 * @file Todo class and aggregate root
 * @copyright 2020 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.domain.todo;

import javax.validation.constraints.NotBlank;

public class Todo extends TodoDto {
    private int id;
    @NotBlank
    private String title;

    @NotBlank
    private String description;

    private Boolean done;

    private DueDate dueDate;

    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Boolean getDone() {
        return done;
    }

    @Override
    public void setDone(Boolean done) {
        this.done = done;
    }

    public DueDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(DueDate dueDate) {
        this.dueDate = dueDate;
    }
}
