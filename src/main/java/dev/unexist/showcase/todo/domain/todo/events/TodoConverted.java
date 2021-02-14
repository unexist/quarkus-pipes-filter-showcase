/**
 * @package Quarkus-Pipes-Filters-Showcase
 *
 * @file Todo created even
 * @copyright 2020 Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the GNU GPLv2.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.domain.todo.events;

import dev.unexist.showcase.todo.domain.todo.Todo;
import dev.unexist.showcase.todo.infrastructure.base.AbstractBaseEvent;
import io.cloudevents.CloudEvent;
import io.cloudevents.v1.CloudEventImpl;

public class TodoConverted extends AbstractBaseEvent<Todo> {
    public TodoConverted(CloudEventImpl<Todo> cloudEvent) {
        super(cloudEvent);
    }

    public TodoConverted(Todo todo) {
        super(todo);
    }
}
