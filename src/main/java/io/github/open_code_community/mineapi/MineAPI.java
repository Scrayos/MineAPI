package io.github.open_code_community.mineapi;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MineAPI {

    @Getter
    private static MineAPI instance = new MineAPI();


    private MineAPI() {
        log.debug("MineAPI was initialized!");
    }
}
