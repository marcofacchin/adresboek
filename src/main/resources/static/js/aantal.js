"use strict";
import {setText, toon} from "./util.js";

const response = await fetch("adresboek/aantalpersonen");
if (response.ok) {
    const body = await response.text();
    setText("aantal", body);
} else {
    toon("storing");
}