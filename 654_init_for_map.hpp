

//////// NPC Init \\\\

this allowDamage false; this enableSimulation false;this addAction[localize"STR_Process_654",life_fnc_processAction,"654",0,false,false,"",' life_inv_654_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "654" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "654" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"654",0,false,false,"",' !license_civ_654 && playerSide isEqualTo civilian '];