package io.github.open_code_community.mineapi;

import lombok.Getter;

public class MineAPI {

    @Getter
    private static MineAPI instance = new MineAPI();


    private MineAPI() {

    }
}
