<?php

use Illuminate\Http\Request;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});

Route::get('/test', function () {
    return 'this is php response';
});

Route::get('/health', function () {
    $res = [
        'status' => 'UP'
    ];
    return response(json_encode($res))
        ->header('Content-Type', 'application/json');
});

Route::get('/call_java', function () {
    $client = new GuzzleHttp\Client(['base_uri' => 'http://127.0.0.1:7999/java-api/']);
    $response = $client->request('GET', 'api/test');
    return $response->getBody();
});
