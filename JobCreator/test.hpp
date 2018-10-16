||||stringtable.xml||||

<Key ID="STR_License_test">
			<Original>test</Original>
		</Key>
<Key ID="STR_Process_test">
			<Original>test</Original>
		</Key>
<Key ID="STR_Item_test_unprocessed">
			<Original>test</Original>
		</Key>
<Key ID="STR_Item_test_processed">
			<Original>test</Original>
		</Key>

||||Config_Gather.hpp||||

class test {
            amount = 123;
            zones[] = {"test"};
            item = "pickaxe";
            zoneSize = 23;
        };

||||Config_Licenses.hpp||||

class test {
        variable = "test";
        displayName = "STR_License_test";
        price = 123;
        illegal = false;
        side = "civ";
	};

||||Config_Process.hpp||||

class test {
        MaterialsReq[] = {{ "test_unrefined",123}};
        MaterialsGive[] = {{ "test_refined",123}};
        Text = "STR_Process_test";
        NoLicenseCost = 2312;
	};

||||Config_vItems.hpp||||

class test {
        variable = "test_unprocessed"
        displayName = "STR_Item_test_unprocessed"
        weight = 123;
        buyPrice = 132;
        sellPrice = 132;
        illegal = false;
        edible = false;
        icon = "";
	};

class test {
        variable = "test_processed"
        displayName = "STR_Item_test_processed"
        weight = 123;
        buyPrice = 123;
        sellPrice = 123;
        illegal = false;
        edible = false;
        icon = "";
	};