Feature: Feature Samsung Galaxy products
  Scenario Outline: to verify the Samsung mobile tariff
    Given User is on the Business shop homepage
    Then hovers on phones and select device "<DevName>"
    Then User is navigated to the mobile description page and clicks on view all tariffs
    Then navigated to Tariffs and Extras page and verifies the 36month tariffs
    Then compares the 36month- 20GB tariff values with pricing matrix values <upfront_20GB> "<month_20GB>"
    Then compares the 36month- Unlimited tariff values with pricing matrix values <upfront_unlimited> "<month_unlimited>"
    Then compares the 36month- 6GB tariff values with pricing matrix values <upfront_6GB> "<month_6GB>"
    Then compares the 36month- 70GB tariff values with pricing matrix values <upfront_70GB> "<month_70GB>"
    Then clicks on 24months button
    Then Compares the 24month- 20GB tariff values with pricing matrix values <24upfront_20GB> "<24month_20GB>"
    Then Compares the 24month- Unlimited tariff values with pricing matrix values <24upfront_unlimited> "<24month_unlimited>"
    Then Compares the 24month- 6GB tariff values with pricing matrix values <24upfront_6GB> "<24month_6GB>"
    Then Compares the 24month- 70GB tariff values with pricing matrix values <24upfront_70GB> "<24month_70GB>"

    Examples:
      |Scenario_id| Phone                     |Memory_variant |  upfront_20GB| month_20GB |upfront_unlimited | month_unlimited| upfront_6GB |month_6GB   |upfront_70GB | month_70GB | 24upfront_20GB | 24month_20GB | 24upfront_unlimited | 24month_unlimited |24upfront_6GB|24month_6GB|24upfront_70GB | 24month_70GB|
      |1          |Samsung Galaxy S20 FE 5G   |256            |30            |41 .00       |30                |48 .00          |30           |38 .00      |30           |44 .00      |10              |56 .00        |10                   |63 .00             |10           |53 .00     |10             |59 .00       |
