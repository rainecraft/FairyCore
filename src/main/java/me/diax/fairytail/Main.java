/*
 * Copyright 2017 Comportment | comportment@diax.me
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.diax.fairytail;

import me.diax.fairytail.announcer.Announcer;
import me.diax.fairytail.joinleave.JoinQuit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

/**
 * Created by Comportment at 22:30 on 22/05/17
 * https://github.com/Comportment | comportment@diax.me
 *
 * @author Comportment
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new Announcer(this);
        new JoinQuit(this);
    }

    public void registerEvents(Listener... listeners) {
        Arrays.stream(listeners).forEach(listener -> this.getServer().getPluginManager().registerEvents(listener, this));
    }
}