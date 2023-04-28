Feature: Tariff Refresh-Phone Apple

  Scenario Outline:  Verify the Tariff of mobile product-Apple
    Given Customer launch the business shop
    Then navigates to phones and select device with name "<DevName>"
    Then selects "<memory>" variant and clicks on view tariff button
    Then navigated to tariffs and extras page and verifies the 36month tariffs
    Then compares 36month- 20GB tariff values with pricing matrix values <36upfront_20GB> <36month_20GB>
    Then compares 36month- Unlimited tariff values with pricing matrix values <36upfront_unlimited> <36month_unlimited>
    Then compares 36month- 3GB tariff values with pricing matrix values <36upfront_3GB> <36month_3GB>
    Then compares the 36month- 6GB tariff values with pricing matrix values <36upfront_6GB> <36month_6GB>
    Then compares 36month- 70GB tariff values with pricing matrix values <36upfront_70GB> <36month_70GB>
    Then clicks on 24 months tariff button
    Then compares 24month- 20GB tariff values with pricing matrix values <24upfront_20GB> <24month_20GB>
    Then compares 24month- Unlimited tariff values with pricing matrix values <24upfront_unlimited> <24month_unlimited>
    Then compares the 24month- 3GB tariff values with pricing matrix values <24upfront_3GB> <24month_3GB>
    Then compares the 24month- 6GB tariff values with pricing matrix values <24upfront_6GB> <24month_6GB>
    Then compares 24month- 70GB tariff values with pricing matrix values <24upfront_70GB> <24month_70GB>

    Examples:
      |serial number|DevName       |memory  |36upfront_20GB|36month_20GB|36upfront_unlimited|36month_unlimited|36upfront_3GB|36month_3GB|36upfront_6GB|36month_6GB|36upfront_70GB|36month_70GB|24upfront_20GB|24month_20GB|24upfront_unlimited|24month_unlimited|24upfront_3GB|24month_3GB|24upfront_6GB|24month_6GB|24upfront_70GB|24month_70GB|
      |1            |iPhone 11     |64GB    |10           |20          |20                 |23               |10            |26         |10            |29        |10            |33         |10           |25         |10           |28         |10            |31          |10            |34          |10                 |38               |
