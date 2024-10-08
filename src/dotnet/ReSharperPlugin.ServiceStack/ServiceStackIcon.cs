using System.Drawing;
using JetBrains.Application.Icons.CompiledIconsCs;
using JetBrains.Util;
using JetBrains.Util.Icons;
using JetBrains.Util.Icons.Serializers;

namespace ReSharperPlugin.ServiceStack
{
    [CompiledIconCs]
    public class ServiceStackIcon : CompiledIconCsClass
    {
        private static string svg =
            @"""<svg ti:v='1' width='1' height='1'  viewBox='0,0,100,100' xmlns='http://www.w3.org/2000/svg' xmlns:ti='urn:schemas-jetbrains-com:tisvg'> 
                                                        xmlns='http://www.w3.org/2000/svg'>
                                                        <style> .path{} </style>
                                                        <g id='servicestack-svg'>
                                                            <path fill='#000' class='path' stroke='null' d='m16.564516,43.33871c16.307057,2.035887 54.629638,20.41875 60.67742,46.306452l-78.241936,0c19.859879,-1.616734 36.825605,-27.344758 17.564516,-46.306452zm6.387097,-30.33871c6.446976,7.105645 9.520766,16.74617 9.26129,26.666129c16.546573,6.726411 41.376412,24.690121 46.625807,49.979033l19.161291,0c-8.123589,-43.132863 -54.529839,-73.551412 -75.048388,-76.645162z' />
                                                        </g>
                                                    </svg>
                                                     """;
        public override CompiledIconCsIdOwner.ThemedIconThemeImage[] GetThemeImages()
        {
            return new[]
            {
                new CompiledIconCsIdOwner.ThemedIconThemeImage("Color",
                    () => TiImageSerializerSvg.Parse(svg, OnError.Ignore)),
                new CompiledIconCsIdOwner.ThemedIconThemeImage("Gray",
                    () => TiImageSerializerSvg.Parse(svg, OnError.Ignore)),
                new CompiledIconCsIdOwner.ThemedIconThemeImage("GrayDark",
                    () => TiImageSerializerSvg.Parse(svg, OnError.Ignore))
            };
        }
    }
}