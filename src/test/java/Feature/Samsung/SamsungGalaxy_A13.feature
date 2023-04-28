Feature: Feature Samsung Galaxy A series
  Scenario Outline: to verify the Samsung mobile tariff
    Given User is on the Business homepage
    Then hovers on phones and select device with name "<DevName>"
    Then User is navigated to the phone description page and clicks on view all tariffs
    Then navigated to tariffs and Extras page and verifies the 36month tariffs
    Then compares the 36month- 20GB tariff with pricing matrix values <upfront_20GB> <month_20GB>
    Then compares the 36month- Unlimited tariff with pricing matrix values <upfront_unlimited> <month_unlimited>
    Then compares the 36month- 3GB tariff with pricing matrix values <upfront_3GB> <month_3GB>
    Then compares the 36month- 6GB tariff with pricing matrix values <upfront_6GB> <month_6GB>
    Then compares the 36month- 70GB tariff with pricing matrix values <upfront_70GB> <month_70GB>
    Then click on 24months button
    Then compares the 24month- 20GB tariff values with pricing matrix values <24upfront_20GB> "<24month_20GB>"
    Then compares the 24month- Unlimited tariff values with pricing matrix values <24upfront_unlimited> "<24month_unlimited>"
    Then compares the 24month- 3GB tariff values with pricing matrix values <24upfront_3GB> "<24month_3GB>"
    Then compares the 24month- 6GB tariff values with pricing matrix values <24upfront_6GB> "<24month_6GB>"
    Then compares the 24month- 70GB tariff values with pricing matrix values <24upfront_70GB> "<24month_70GB>"


    Examples:
      |Scenario_id|DevName                     | upfront_20GB| month_20GB |  upfront_unlimited | month_unlimited| upfront_3GB| month_3GB  | upfront_6GB |month_6GB   |upfront_70GB | month_70GB | 24upfront_20GB | 24month_20GB | 24upfront_unlimited | 24month_unlimited |  24upfront_3GB|24month_3GB|24upfront_6GB|24month_6GB|24upfront_70GB | 24month_70GB|
      |1          |Samsung Galaxy A13          |10           |26          |10                  |33              |10          | 20         |10           | 23         |10           |29          |10              |27 .50        |10                   |34 .50             |10             |21 .50     |10           |   24 .50  |10             |30 .50       |
