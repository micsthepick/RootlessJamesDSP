package me.timschneeberger.rootlessjamesdsp.dump.data

import me.timschneeberger.rootlessjamesdsp.model.AudioSessionEntry

data class AudioServiceDump(override val sessions: HashMap<Int /* sid */, AudioSessionEntry>) :
    ISessionInfoDump
{
    override fun toString(): String {
        val sb = StringBuilder("\n--> Session stack\n")
        sessions.forEach { (key, value) ->
            sb.append("sid=$key\t-> $value\n")
        }
        return sb.toString()
    }
}