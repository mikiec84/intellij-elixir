package org.elixir_lang.beam.chunk.debug_info.v1.erl_abstract_code.abstract_code_compiler_options.abstract_code.type

import com.ericsson.otp.erlang.OtpErlangTuple
import org.elixir_lang.beam.chunk.debug_info.v1.erl_abstract_code.abstract_code_compiler_options.abstract_code.MacroString
import org.elixir_lang.beam.chunk.debug_info.v1.erl_abstract_code.abstract_code_compiler_options.abstract_code.Type.ifSubtypeTo

object MapFieldAssociation {
    fun ifToMacroString(type: OtpErlangTuple): MacroString? = ifSubtypeTo(type, SUBTYPE) { toMacroString(type) }

    private const val SUBTYPE = "map_field_assoc"

    private fun toMacroString(type: OtpErlangTuple) = MapField.toMacroString(type, "optional")
}
