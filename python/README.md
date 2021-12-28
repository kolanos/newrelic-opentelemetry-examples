# Python service instrumented with OpenTelemetry 

This repo contains a simple Python service that has been instrumented with [OpenTelemetry-Python](https://github.com/open-telemetry/opentelemetry-python). You can configure it to export traces to your New Relic account!

## Prerequisites

- Sign up for a [free New Relic account](https://newrelic.com/signup).

- Copy your New Relic [account ingest license key](https://one.newrelic.com/launcher/api-keys-ui.launcher).

- This assumes you have `pip` and `python3` installed on your machine. 

## Run

1. Run `pip install -r requirements.txt`.

2. Set the following environment variable:

   ```shell
   export OTEL_EXPORTER_OTLP_HEADERS=api-key=<your_license_key_here>
   ```
   - Replace `<your_license_key_here>` with your New Relic account ingest license key.

   **Note: `OTEL_EXPORTER_OTLP_ENDPOINT` has been set to `https://otlp.nr-data.net:4317` in the code. Change this value to send it to the exporter of your choice. See docs [here](https://opentelemetry-python.readthedocs.io/en/latest/sdk/environment_variables.html#opentelemetry.sdk.environment_variables.OTEL_EXPORTER_OTLP_TRACES_ENDPOINT).**

3. Run the service:

   ```shell
   python3 main.py
   ```

    - Run that command as many times as you like to generate trace data.
    - This application produces trace data reporting to a service called `python-app`. 

## View your data in the New Relic UI

Look for `python-app` under `Services - OpenTelemetry` in your New Relic account!