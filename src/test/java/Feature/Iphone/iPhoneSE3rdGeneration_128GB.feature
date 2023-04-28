Feature: Tariff Refresh-Phone Apple

  @iPhoneSE3rdGeneration
  Scenario Outline:  Verify the Tariff of mobile product-Apple1
    Given Customer did launch the businessshop
    Then navigates to phone section and selects device with name "<DevName>"
    Then Customer selects the "<memory>" variant and clicks on view tariff button
    Then user is navigated to tariffs and extras page for verifies the 36month tariffs
    Then compare the 36month- 3GB tariff values with pricing matrix values <36upfront_3GB> <36month_3GB>
    Then compare the 36month- 6GB tariff values with pricing matrix values <36upfront_6GB> <36month_6GB>
    Then compare the 36month- 20GB tariff values with pricing matrix values <36upfront_20GB> <36month_20GB>
    Then compare the 36month- 70GB tariff values with pricing matrix values <36upfront_70GB> <36month_70GB>
    Then compare the 36month- Unlimited tariff values with pricing matrix values <36upfront_unlimited> <36month_unlimited>
    Then click on 24months tariff button
    Then compare the 24month- 3GB tariff values with pricing matrix values <24upfront_3GB> <24month_3GB>
    Then compare the 24month- 6GB tariff values with pricing matrix values <24upfront_6GB> <24month_6GB>
    Then compare the 24month- 20GB tariff values with pricing matrix values <24upfront_20GB> <24month_20GB>
    Then compare the 24month- 70GB tariff values with pricing matrix values <24upfront_70GB> <24month_70GB>
    Then compare the 24month- Unlimited tariff values with pricing matrix values <24upfront_unlimited> <24month_unlimited>

    Examples:
      |serial number|DevName                 |memory  |36upfront_3GB|36month_3GB|36upfront_6GB|36month_6GB|36upfront_20GB|36month_20GB|36upfront_70GB|36month_70GB|36upfront_unlimited|36month_unlimited|24upfront_3GB|24month_3GB|24upfront_6GB|24month_6GB|24upfront_20GB|24month_20GB|24upfront_70GB|24month_70GB|24upfront_unlimited|24month_unlimited|
      |2            |iPhone SE 3rd Generation|128GB   |10           |22         |10           |25         |10            |28          |10            |31          |10                 |35               |10           |33         |10           |36         |10            |39          |10            |42          |10                 |46               |