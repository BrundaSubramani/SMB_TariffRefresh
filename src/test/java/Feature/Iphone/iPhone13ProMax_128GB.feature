Feature: Tariff Refresh-Phone Apple

  Scenario Outline:  Verify the Tariff of mobile product-Apple
    Given Customer launch the businessshop
    Then navigates to phones and selects device with name "<DevName>"
    Then selects the "<memory>" variant and clicks on view tariff button
    Then navigated to tariffs and extras page for verifies the 36month tariffs
    Then navigated to tariffs and extras page for verifies the 36month tariffs
    Then compares the 36month- 20GB tariff values with pricing matrix values <36upfront_20GB> <36month_20GB>
    Then compares the 36month- Unlimited tariff values with pricing matrix values <36upfront_unlimited> <36month_unlimited>
    Then compares the 36month- 70GB tariff values with pricing matrix values <36upfront_70GB> <36month_70GB>
    Then clicks on 24months tariff button
    Then compares the 24month- 20GB tariff values with pricing matrix values <24upfront_20GB> <24month_20GB>
    Then compares the 24month- Unlimited tariff values with pricing matrix values <24upfront_unlimited> <24month_unlimited>
    Then compares the 24month- 70GB tariff values with pricing matrix values <24upfront_70GB> <24month_70GB>

    Examples:
      | serial number |DevName             |memory|  36upfront_20GB|36month_20GB|36upfront_unlimited |36month_unlimited|36upfront_70GB| 36month_70GB   | 24upfront_20GB | 24month_20GB | 24upfront_unlimited | 24month_unlimited | 24upfront_70GB | 24month_70GB|
      |1              |iPhone 13 Pro Max   |128GB |20              |57          |20                  |64              |20           |60                |20              |76            |20                   |83                 |20              |79           |
